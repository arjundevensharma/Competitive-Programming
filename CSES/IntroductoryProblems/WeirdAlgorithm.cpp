#include <bits/stdc++.h>
using namespace std;
 
#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define sz(a) (int)a.size()
#define ar array
 
ll n;
 
void solve () {
    cin >> n;
 
    cout << n << ' ';
 
    while (n > 1) {
        if (n % 2 == 0) {
            n/=2;
            cout << n << ' ';
        } else {
            n*= 3;
            n++;
            cout << n << " ";
        }
    }
}
 
int main () {
    ios::sync_with_stdio();
    cin.tie(0);
 
    solve();
}
