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
 
long n;
 
void solve () {
    cin >> n;
 
    long a[n];
 
    FR(i, n) cin >> a[i];
 
    long moves=0;
 
    FOR(i, 1, n) {
        if (a[i] < a[i - 1]) {
            long tot = (a[i-1] - a[i]);
            a[i] = a[i - 1];
            moves += tot;
        }
    }
 
    cout << moves;
}
 
int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);
 
    solve();
}
