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
 
string s;
 
void solve () {
    cin >> s;
 
    int numOdds = 0;
    int oddInd = -1;
 
    vector<int> count (26, 0);
    FR(i, s.length()) {
        count[s[i] - 'A']++;
    }
    FR (i, 26) {
        if (count[i]  % 2 != 0) {
            numOdds++; oddInd = i;
        }
    }
 
    string finString;
 
    if (numOdds > 1) cout << "NO SOLUTION";
    else {
        FR(i, 26) {
                FR (j, count[i] / 2)
                    finString += ('A' + i);
        }
 
        if(oddInd >= 0) finString += 'A' + oddInd;
 
        FORR(i, 25, 0) {
                FR (j, count[i] / 2)
                    finString += ('A' + i);
        }
        cout << finString;
    }
}
 
int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
 
    solve();
}
