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
    const int LIM = 2e5+5;
    int sz, op, rslt = 1, y[LIM], idx[LIM];
    cin >> sz >> op;
    FOR(i, 1, sz+1) {
        cin >> y[i];
        idx[y[i]] = i;
    }
    idx[sz+1] = sz+1;
    int prev = 0;
    FOR(i, 1, sz+1) {
        if(prev > idx[i]) rslt++;
        prev = idx[i];
    }
    auto mod = [&](int u, int v) {
        if(idx[y[u]-1] <= idx[y[u]] && v < idx[y[u]-1]) rslt++;
        if(idx[y[u]-1] > idx[y[u]] && v >= idx[y[u]-1]) rslt--;
        if(idx[y[u]+1] >= idx[y[u]] && v > idx[y[u]+1]) rslt++;
        if(idx[y[u]+1] < idx[y[u]] && v <= idx[y[u]+1]) rslt--;
        idx[y[u]] = v;
        if(idx[y[v]-1] <= idx[y[v]] && u < idx[y[v]-1]) rslt++;
        if(idx[y[v]-1] > idx[y[v]] && u >= idx[y[v]-1]) rslt--;
        if(idx[y[v]+1] >= idx[y[v]] && u > idx[y[v]+1]) rslt++;
        if(idx[y[v]+1] < idx[y[v]] && u <= idx[y[v]+1]) rslt--;
        idx[y[v]] = u;
        swap(y[u], y[v]);
    };
    FR(i, op) {
        int a, b;
        cin >> a >> b;
        mod(a, b);
        cout << rslt << '\n';
    }
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    solve();
}
