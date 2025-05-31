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
 
string s;
 
void solve () {
    cin >> s;
 
    vector<int> a(26,0);
 
    FR(i, s.size()) {
        a[s[i] - 'A'] ++;
    }
 
    int b = 0;
    int c = 0;
 
    FR(i, 26) {
        if (a[i] % 2 != 0) {
            b++;
            c = i;
        }
    }
 
    int ind = 0;
 
    if (b > 1) cout << "NO SOLUTION";
    else {
        FR (i, 26) {
            while (a[i] > 1) {
                s[ind] = ('A' + i);
                s[s.size() - 1 - ind] =  ('A' + i);
                a[i] -= 2;
                ind++;
            }
        }
 
        if (a[c] > 0) {
            s[ind] = ('A' + c);
        }
 
        cout << s;
    }
}
 
int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
 
    //int t; 
    //cin >> t;
 
    //while (t--) {
        solve();
    //}
}
