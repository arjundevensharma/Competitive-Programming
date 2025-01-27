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
    int z;
    ll y, b[1001];
    unordered_map<ll,vector<pair<int,int>>> um;
    cin >> z >> y;
    um.reserve(1001*1001);
    FOR(k, 1, z + 1) {
        cin >> b[k];
        FOR(l, 1, k) {
            ll sum = b[k] + b[l];
            if(sum >= y) continue;
            auto it = um.find(y - sum);
            if(it != um.end()) {
                for(auto &u : it->second) {
                    if(u.first != l && u.second != l && u.first != k && u.second != k) {
                        cout << u.first << " " << u.second << " " << l << " " << k << "\n";
                        return;
                    }
                }
            } else um[sum].pb({l, k});
        }
    }
    cout << "IMPOSSIBLE\n";
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    solve();
}
