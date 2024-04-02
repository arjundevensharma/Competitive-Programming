/**
 * Solution by arjundevensharma
 * Date: 02/01/2024
 * Contest: April Fools Day Contest 2024
 * Problem: F. Grid
**/

#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define sz(a) (int)a.size()

#define FR(i, n) for(int i = 0; i < (n); i++)
#define FOR(i, a, b) for(int i = (a); i < (b); i++)
#define FORR(i, a, b) for(int i = (a); i >= (b); i--)

int dx[] = {1, -1, 0, 0, 0, 0, 0, 0, 1, -1};
int dy[] = {0, 0, 1, -1, 0, 0, 1, -1, 0, 0};
int dz[] = {0, 0, 0, 0, 1, -1, 0, 0, 0, 0};

void solve() {

    vector <string> a (21);

    for (auto&x : a) cin >> x;

    int mx = 0;
    FR (i, a.size() - 4) {
        FR (j, a[i].length() - 3) {
            int b = 0;
            FR(k, 4) {
                FR(l, 4) {
                    b += a[i + k][j + l] - '0';
                }
            }
            mx = max(mx, b);
        }
    }
    
    cout << mx;
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    //int t;
    //cin >> t;
    //while (t--)
        solve();
}
