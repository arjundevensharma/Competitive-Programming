#include <bits/stdc++.h>
using namespace std;
 
#define ll long long
#define ar array
 
int n;
string s;
 
void solve () {
    cin >> n >> s;
 
    vector<int> alphabet (26, n);
 
    int sum = 0;
 
    for (int i = n - 1; i >= 0; i--) {
        sum += alphabet[s[i] - 'a'] - i;
        alphabet[s[i] - 'a'] = i;
    }
 
    cout << sum << "\n";
}
 
int main () {
    ios::sync_with_stdio();
    cin.tie(0);
 
    int t;
    cin >> t;
    
    while (t--)
        solve();
}
