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
    int Z, x, y, r1[mxN], r2[mxN], opt[mxN];
    vector<int> adj[mxN];
 
    cin >> Z;
    FR(k, Z-1){
        cin >> x >> y;
        adj[x].pb(y), adj[y].pb(x);
    }
 
    function<void(int, int)> dfs1 = [&](int c, int p){
        for(int q : adj[c]){
            if(q != p){
                dfs1(q, c);
                r1[c] = max(r1[c], r1[q] + 1);
            }
        }
    };
 
    function<void(int, int)> dfs2 = [&](int c, int p){
        int hi = 0, lo = 0;
        for(int q : adj[c]){
            if(q != p){
                if(r1[q] >= r1[hi]){
                    lo = hi, hi = q;
                }else if(r1[q] > r1[lo]){
                    lo = q;
                }
            }
        }
        for(int q : adj[c]){
            if(q != p){
                r2[q] = max(r2[q], r2[c] + 1);
                if(q == hi){
                    if(lo) r2[q] = max(r2[q], r1[lo] + 2);
                }else{
                    if(hi) r2[q] = max(r2[q], r1[hi] + 2);
                }
                dfs2(q, c);
            }
        }
        opt[c] = max(r2[c], r1[c]);
    };
 
    dfs1(1, 0);
    dfs2(1, 0);
    
    FOR(i, 1, Z+1) cout << opt[i] << " \n"[i==Z];
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    solve();
}
