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
 
int a, b;
 
void solve () {
    cin >> a >> b;
 
    int d;
 
    if (a > b) {
        d = a - b;
        a -= d * 2;
        b -= d;
    } else {
        d = b - a;
        b -= d * 2;
        a -= d;
    }
 
    if (a % 3 == 0 && b % 3 == 0 && b >= 0 && a >= 0) cout << "YES\n";
    else cout << "NO\n";
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
