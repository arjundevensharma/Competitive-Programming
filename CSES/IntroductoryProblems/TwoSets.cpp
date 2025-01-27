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
 
ll n;
 
void solve () {
    cin >> n;
 
    //all nums divisible by four are possible
    //all even nums non-divisble by four are not possible
    //odd nums that are 
 
    if ( (n%2 ==0 && n%4 != 0) || (n%2 !=0 && n%4 == 1) ) cout << "NO";
    else {
        cout << "YES\n";
        if (n % 4 == 0) {
            cout << n / 2 << "\n";
            FOR(i, 1, n / 4 + 1) {
                cout << i << ' ' << n + 1 - i << ' ';
            }
            cout << n / 2 << "\n";
            FOR(i, n / 4 + 1, n / 2 + 1) {
                cout << i << ' ' << n + 1 - i << ' ';
            }
        } else {
            //11, 5, 17 ; 6, 4, 2
            int num;
            int toAvoid;
            cout << (n + 1) / 2 << "\n";
            FOR(i, 1, n / 2 + 1) {
                if (n - i + 1 - (n + 1) / 2 == i) {
                    cout << i << ' ' << (n + 1) / 2 << ' ';
                    num = n - i + 1;
                    toAvoid = i;
                    break;
                }
            }
 
            FOR(i, 1, n / 4 + 1) {
                if (i != toAvoid) cout << i << ' ' << n + 1 - i << ' ';
            }
 
            cout << "\n" << n / 2 << "\n";
 
            cout << num << ' ';
            FOR(i, n / 4 + 1, n / 2 + 1) {
                if (i != toAvoid) cout << i << ' ' << n + 1 - i << ' ';
            }
        }
    }
}
 
int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
 
    solve();
}
