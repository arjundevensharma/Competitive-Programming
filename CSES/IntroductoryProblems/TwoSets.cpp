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
    
    long double l = ((n + 1) * (n / 2.0) );
 
    if ( (ll)l % 2 != 0) cout << "NO";
    else {
        l/= 2.0;
        cout << "YES\n";
        string ow = "";
        string nw = "";
        ll c = 0;
        FORR(i, n, 1) {
            if (l - i >= 0) {
                ow += to_string(i) + " ";
                l -= i;
                c++;
            } else {
                nw += to_string(i) + " ";
            }
        }
        cout << c << "\n" << ow << "\n" << (n - c) << "\n" << nw;
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
