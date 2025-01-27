#include <bits/stdc++.h>
using namespace std;
 
#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define sz(a) (int)a.size()
 
#define FR(i, n) for(int i = 0; i < (n); i++)
#define FOR(i, a, b) for(int i = (a); i < (b); i++)
#define FORR(i, a, b) for(int i = (a); i >= (b); i--)
 
//directions of movement
int dx[] = {1, -1, 0, 0, 0, 0, 0, 0, 1, -1};
int dy[] = {0, 0, 1, -1, 0, 0, 1, -1, 0, 0};
int dz[] = {0, 0, 0, 0, 1, -1, 0, 0, 0, 0};
 
int n;
 
void solve() {
    const int L = 1e5 + 5;
    struct St {
        int d, p, v, fp;
        map<char, int> ne;
    } st[2 * L];
 
    char A[L], B[5 * L];
    int n, m, x, gc = 1, ls = 0;
 
    auto add = [&](char ch) {
        int cr = gc++, f = ls;
        st[cr].v = 1;
        st[cr].fp = st[ls].d;
        st[cr].d = st[ls].d + 1;
        for(; f != -1 && !st[f].ne.count(ch); f = st[f].p) st[f].ne[ch] = cr;
        if(f == -1) st[cr].p = 0;
        else {
            int q = st[f].ne[ch];
            if(st[f].d + 1 == st[q].d) st[cr].p = q;
            else {
                int cl = gc++;
                st[cl] = {st[f].d + 1, st[q].p, 0, st[q].fp, st[q].ne};
                for(; f != -1 && st[f].ne[ch] == q; f = st[f].p) st[f].ne[ch] = cl;
                st[q].p = st[cr].p = cl;
            }
        }
        ls = cr;
    };
 
    auto prep = [&]() {
        st[0].d = 0, st[0].p = -1;
    };
 
    auto upv = [&]() {
        vector<int> vl[gc];
        FR(i, gc) vl[st[i].d].pb(i);
        FORR(i, gc - 1, 0) for(int u : vl[i]) if(st[u].p != -1) st[st[u].p].v += st[u].v;
    };
 
    auto qc = [&]() -> int {
        int u = 0;
        FR(i, m) {
            if(!st[u].ne.count(B[i])) return 0;
            u = st[u].ne[B[i]];
        }
        return st[u].v;
    };
 
    auto qi = [&]() -> int {
        int u = 0;
        FR(i, m) {
            if(!st[u].ne.count(B[i])) return -1;
            u = st[u].ne[B[i]];
        }
        return st[u].fp - m + 2;
    };
 
    scanf(" %s %d", A, &x);
    n = strlen(A);
 
    prep();
    FR(i, n) add(A[i]);
    upv();
 
    FR(i, x) {
        scanf(" %s", B);
        m = strlen(B);
        printf("%d\n", qi());
    }
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    solve();
}
