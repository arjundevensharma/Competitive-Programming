#include <bits/stdc++.h>
using namespace std;
 
#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define mp make_pair
#define sz(a) (int)a.size()
 
#define FR(i, n) for(int i = 0; i < (n); i++)
#define FOR(i, a, b) for(int i = (a); i < (b); i++)
#define FORR(i, a, b) for(int i = (a); i >= (b); i--)
 
int dx[] = {1, -1, 0, 0, 0, 0, 0, 0, 1, -1};
int dy[] = {0, 0, 1, -1, 0, 0, 1, -1, 0, 0};
int dz[] = {0, 0, 0, 0, 1, -1, 0, 0, 0, 0};
 
int n;
 
void solve () {
    cin >> n;
 
    for(int k = 1; k <= n; k++) {
        long double tot = 0;
 
        int h = k * k;
 
        tot = ( h * 1.0 ) * ( ( h-1) / 2.0);
 
        tot -= ( (k-2)*10 ) + (4) + ( (k-4) * (k-2) * 4) + ( (k-4) * 2);
 
        cout << fixed << (long long) tot << "\n";
    }
    
}
 
int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
 
    //int t; 
    //cin >> t;
 
    //while (t--) {
        solve();
    //}
}
