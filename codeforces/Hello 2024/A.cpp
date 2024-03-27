#include <bits/stdc++.h>
using namespace std;
 
#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define sz(a) (int)a.size()
#define ar array
 
ll a, b;
 
void solve () {
    cin >> a >> b;
 
    ll sum = a + b;
 
    if (sum % 2 == 0)
        cout << "Bob\n";
    else
        cout <<"Alice\n";
}
 
int main () {
    ios::sync_with_stdio();
    cin.tie(0);
 
    int t;
    cin >> t;
    
    while (t--)
        solve();
}
