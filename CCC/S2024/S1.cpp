#include <bits/stdc++.h>
using namespace std;
 
#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define sz(a) (int)a.size()
 
#define FR(i, n) for(int i = 0; i < (n); i++)
#define FOR(i, a, b) for(int i = (a); i < (b); i++)
#define FORR(i, a, b) for(int i = (a); i >= (b); i--)
 
//directions of movement
int dx[] = {1, -1, 0, 0, 0, 0, 0, 0, 1, -1};
int dy[] = {0, 0, 1, -1, 0, 0, 1, -1, 0, 0};
int dz[] = {0, 0, 0, 0, 1, -1, 0, 0, 0, 0};

int n;
string s;

void solve () {
    cin >> s;

    vector <int> occs (26, 0);

    FR (i, n) {
        occs[s[i] - 'a'] ++;
    }

    bool thisTrue = true;
    bool light;
    if (occs[s[0] - 'a'] == 1) light = true;
    else light = false; 

    FOR (i, 1, n) {
        if ( (occs[s[i] - 'a'] > 1 && light != true) || (occs[s[i] - 'a'] == 1 && light == true) ) {
            thisTrue = false;
            break;
        } else {
            light = !(light);
        }
    }

    if (thisTrue == true) {
        cout << "T\n";
    } else {
        cout << "F\n";
    }
}
 
int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    int t; cin >> t; cin >> n;

    while (t--) {
        solve();
    }
}
