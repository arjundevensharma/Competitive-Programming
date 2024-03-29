/**
 * Solution by arjundevensharma
 * Date: 29/03/2024
 * Contest: Codeforces Round 937 (Div. 4)
 * Problem: C. Clock Conversion
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

string s;

void solve() {
    cin >> s;

    int hour = stoi(s.substr(0, 2));
    if (hour > 12) {
    cout << setw(2) << setfill('0') << hour - 12 << s.substr(2, 3) << " PM\n";
    } else if (hour == 12) cout << s << " PM\n"; 
    else if (hour == 0) cout << "12" << s.substr(2, 3) << " AM\n";
    else cout << setw(2) << setfill('0') << hour << s.substr(2, 3) << " AM\n";

}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin >> t;
    while (t--)
        solve();
}
