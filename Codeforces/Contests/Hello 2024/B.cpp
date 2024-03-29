#include <bits/stdc++.h>
using namespace std;
 
#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define sz(a) (int)a.size()
#define ar array
 
int n;
string s;
 
void solve () {
    cin >> n >> s;
 
    int sum = 0;
 
    for (int i = 0; i < n; i++) sum += (s[i] - ',');
 
    cout << abs(sum) << "\n";
}
 
int main () {
    ios::sync_with_stdio();
    cin.tie(0);
 
    int t;
    cin >> t;
    
    while (t--)
        solve();
}
