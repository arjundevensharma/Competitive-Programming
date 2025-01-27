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
 
    int longest = 1;
    int current = 1;
 
    FOR(i, 1, s.length()) {
        if (s[i] == s[i - 1]) {
            current++;
        }
        else {
            longest = max(longest, current);
            current = 1;
        }
    }
    
    longest = max(longest,current);
    
    cout << longest;
}
 
int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);
 
    solve();
}
