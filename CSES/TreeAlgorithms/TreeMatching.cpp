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
    const int mxN = 2e5+1;
    int z, x, y, r = 0;
    bool m[mxN];
    vector<int> p[mxN];
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cin >> z;
    FR(i, z-1) {
        cin >> x >> y;
        p[x].pb(y);
        p[y].pb(x);
    }
    function<void(int, int)> d = [&](int c, int pr) {
        for(int v : p[c])
            if(v != pr)
                d(v, c);
        if(!m[pr] && !m[c] && pr != 0) {
            m[pr] = m[c] = true;
            r++;
        }
    };
    d(1, 0);
    cout << r << "\n";
}
 
int main() {
    solve();
}
