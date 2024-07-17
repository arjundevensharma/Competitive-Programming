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

int n, m, k;

void solve() {
    cin >> n >> m >> k;

    set <int> a, b;

    FR(i,n) {
        int c;
        cin >> c;
        a.insert(c);
    }

    FR(i,m) {
        int c;
        cin >> c;
        b.insert(c);
    }

    int n = 0;

    auto it = b.begin();
    auto elem = a.begin();

    while (it != b.end()) {
        if (*elem - *it > k) {
            it++;
        } else if (*it - *elem > k) {
            elem++;
        } else if (abs(*elem - *it) <= k) {
            n++;
            elem++;
            it++;
        }
    }

    cout << n;
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    //int t;
    //cin >> t;
    //while (t--)
        solve();
}
