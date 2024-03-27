#include <bits/stdc++.h>
using namespace std;
 
#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define sz(a) (int)a.size()
#define ar array
 
int n, k;
 
void solve () {
    cin >> n >> k;
 
    vector<int> a(n);
    vector <int> b(n);
 
    for (int i = 0; i < n; i++) cin >> a[i];
    for (int i = 0; i < n; i++) cin >> b[i];
 
    int res = 0, sum = 0, mx = 0;
 
    for (int i = 0; i < min(n, k); i++) {
        sum += a[i];
        mx = max(mx, b[i]);
        res = max(res, sum + mx * (k - i - 1));
    }
 
    cout << res << "\n";
}
 
int main () {
    ios::sync_with_stdio();
    cin.tie(0);
 
    int t;
    cin >> t;
    
    while (t--)
        solve();
}
