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
    const int MX = 2e5+10;
    struct Vertex {
        int depth, prev;
        map<char, int> edge;
    } vtx[2*MX];
    char str[MX];
    bool done[2*MX];
    int L, count, tip, dep[2*MX];
    ll res[MX];
 
    auto initialize = [&]() {
        vtx[0].depth = 0;
        vtx[0].prev = -1;
        count = 1;
        tip = 0;
    };
 
    auto add = [&](char ch) {
        int fresh = count++;
        vtx[fresh].depth = vtx[tip].depth + 1;
        int x = tip;
        while(x != -1 && !vtx[x].edge.count(ch)) {
            vtx[x].edge[ch] = fresh;
            x = vtx[x].prev;
        }
        if(x == -1) {
            vtx[fresh].prev = 0;
        } else {
            int y = vtx[x].edge[ch];
            if(vtx[x].depth + 1 == vtx[y].depth) {
                vtx[fresh].prev = y;
            } else {
                int clone = count++;
                vtx[clone] = {vtx[x].depth + 1, vtx[y].prev, vtx[y].edge};
                while(x != -1 && vtx[x].edge[ch] == y) {
                    vtx[x].edge[ch] = clone;
                    x = vtx[x].prev;
                }
                vtx[y].prev = vtx[fresh].prev = clone;
            }
        }
        tip = fresh;
    };
 
    auto traverse = [&](int start = 0) {
        queue<int> q;
        done[start] = true;
        dep[start] = 0;
        q.push(start);
        while(!q.empty()) {
            int v = q.front(); q.pop();
            res[dep[v]]++;
            res[vtx[v].depth + 1]--;
            for(auto &[c, u] : vtx[v].edge) {
                if(!done[u]) {
                    dep[u] = dep[v] + 1;
                    done[u] = true;
                    q.push(u);
                }
            }
        }
    };
 
    scanf("%s", str);
    L = strlen(str);
    initialize();
    FR(i, L) add(str[i]);
    traverse();
    FOR(i, 1, L + 1) {
        res[i] += res[i - 1];
        printf("%lld%c", res[i], " \n"[i == L]);
    }
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    solve();
}
