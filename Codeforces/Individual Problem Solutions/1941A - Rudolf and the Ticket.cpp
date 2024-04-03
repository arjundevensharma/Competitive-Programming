/**
 * Solution by arjundevensharma
 * Date: 03/01/2024
 * Contest: Codeforces Round 933 (Div. 3)
 * Problem: A. Rudolf and the Ticket
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
    
    vector <int> b (n);
    vector <int> c (m);

    for (auto& k : b) cin >> k;
    for (auto& k : c) cin >> k;

    int tot = 0;

    FR (i, n) {
        FR (j, m) {
            if (b[i] + c[j] < k) tot++;
        }
    }

    cout << tot << "\n";
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin >> t;
    while (t--)
        solve();
}
