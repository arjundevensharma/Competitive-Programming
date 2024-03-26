#include <bits/stdc++.h>
using namespace std;
 
#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define sz(a) (int)a.size()
 
#define FR(i, n) for(ll i = 0; i < (n); i++)
#define FOR(i, a, b) for(ll i = (a); i < (b); i++)
#define FORR(i, a, b) for(ll i = (a); i >= (b); i--)
 
//directions of movement
int dx[] = {1, -1, 0, 0, 0, 0, 0, 0, 1, -1};
int dy[] = {0, 0, 1, -1, 0, 0, 1, -1, 0, 0};
int dz[] = {0, 0, 0, 0, 1, -1, 0, 0, 0, 0};
 
ll a, b;
 
void solve () {
    cin >> a >> b;
 
    if (((a + b) % 3 == 0) && (a * 2) >= b && (b * 2) >= a) {
        cout << "YES" << "\n";
    } else {
        cout << "NO" << "\n";
    }
}
 
int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
 
    int t; cin >> t;
    while (t--)
        solve();
}
