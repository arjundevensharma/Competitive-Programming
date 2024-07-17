/**
 * Solution by arjundevensharma
 * Date: 07/17/2024
 * Contest: CSES Problem Set
 * Problem: Apartments
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

const int mxN = 2e5;

int n, m, k, a[mxN], b[mxN];

void solve() {
    cin >> n >> m >> k;
    FR(i, n) cin >> a[i];
    FR(i, m) cin >> b[i];
    sort (a, a + n); sort (b, b + m);
    int ans = 0;
    for (int i = 0, j = 0; i < n; i++) {
        while (j < m && b[j] < a[i] - k) j++;
        if (j < m && b[j] <= a[i] + k) {
            ans++;
            j++;
        }
    }
    cout << ans;
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    //int t;
    //cin >> t;
    //while (t--)
        solve();
}
