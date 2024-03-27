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
    int z, q[20];
    ll x = 0, y = 0, m = 0x3f3f3f3f3f3f3f3f;
 
    cin >> z;
    FR(k, z) cin >> q[k];
 
    FR(i, 1<<z) {
        x = 0; y = 0;
        FR(j, z) {
            if(i & (1<<j)) x += q[j];
            else y += q[j];
        }
        m = min(m, abs(x - y));
    }
    cout << m << "\n";
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
 
    solve();
}
