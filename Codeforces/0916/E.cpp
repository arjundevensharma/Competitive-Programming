#include <bits/stdc++.h>
using namespace std;
 
#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define sz(a) (int)a.size()
#define ar array
 
int n;
 
void solve () {
    cin >> n;
 
    vector<int> a(n);
    for (int i = 0; i < n; i++) cin >> a[i];
 
    map <ll, ll> m;
    ll sum = 0;
    m[0] = 1;
 
    for (int i = 0; i < n; i++) {
        a[i] *= ((i % 2) ? -1 : 1);
        sum += a[i];
 
        if (m[sum]) {
            cout << "YES\n";
            return;
        }
 
        m[sum] ++;
    }
 
    cout << "NO\n";
 
}
 
int main () {
    ios::sync_with_stdio();
    cin.tie(0);
 
    int t;
    cin >> t;
    
    while (t--)
        solve();
}
