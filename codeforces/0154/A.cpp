#include <bits/stdc++.h>
using namespace std;
 
#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define sz(a) (int)a.size()
#define ar array
 
string s1, s2;
 
void solve () {
    cin >> s1 >> s2;
 
    bool found = false;
 
    for (int i = 0; i < s1.size() - 1; i++) {
        if (s1[i] == s2[i] && s1[i] == '0' && s1[i + 1] == s2[i + 1] && s1[i + 1] == '1') {
            found = true;
        }
    }
 
    if (found == true) cout << "YES\n";
    else cout << "NO\n";
}
 
int main () {
    ios::sync_with_stdio();
    cin.tie(0);
 
    int t;
    cin >> t;
    
    while (t--)
        solve();
}
