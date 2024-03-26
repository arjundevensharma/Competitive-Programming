#include <bits/stdc++.h>
using namespace std;
 
#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define sz(a) (int)a.size()
 
#define FR(i, n) for(ll i = 0; i < (n); i++)
#define FOR(i, a, b) for(ll i = (a); i < (b); i++)
#define FORR(i, a, b) for(ll i = (a); i >= (b); i--)
 
//directions of movement
int dx[] = {1, -1, 0, 0, 0, 0, 0, 0, 1, -1};
int dy[] = {0, 0, 1, -1, 0, 0, 1, -1, 0, 0};
int dz[] = {0, 0, 0, 0, 1, -1, 0, 0, 0, 0};
 
ll y, x;
 
void solve () {
    cin >> y >> x;
 
    ll upper = max(y, x);
 
    ll base = upper * upper;
 
    if (base % 2 == 0) {
        base -= abs(1 - x);
        base -= abs(upper - y);
    } else {
        base -= abs(1 - y);
        base -= abs(upper - x);
    }
 
    cout << base << "\n";
}
 
int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int t;
    cin>> t;
 
    while (t--)
        solve();
}
