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
 
ll y, x;
 
void solve () {
    cin >> y >> x;
 
    ll out;
 
    if (y >= x) {
        if (y % 2 != 0) {
            out = ( (y-1) * (y-1)) + x;
        } else {
            out = (y*y) - (x-1);
        }
    } else {
        if (x % 2 == 0) {
            out = ((x-1) * (x-1)) + y;
        } else {
            out = (x*x) - (y-1);
        }
    }
    cout << out << "\n";
}
 
int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
 
    int t; 
    cin >> t;
 
    while (t--) {
        solve();
    }
}
