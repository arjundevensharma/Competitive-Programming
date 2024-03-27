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
    int p, q, b[200000];
    ll l = 0, h = 1e18, m, v;
    cin >> p >> q;
    FR(i, p) {
        cin >> b[i];
        l = max(l, (ll)b[i]);
    }
    auto valid = [&](ll x) -> bool {
        int z = 1;
        ll s = 0;
        FR(i, p) {
            s += b[i];
            if (s > x) {
                z++;
                s = b[i];
            }
        }
        return z <= q;
    };
    while (l <= h) {
        m = l + (h - l) / 2;
        if (valid(m)) h = m - 1;
        else l = m + 1;
    }
    cout << l << '\n';
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    solve();
}
