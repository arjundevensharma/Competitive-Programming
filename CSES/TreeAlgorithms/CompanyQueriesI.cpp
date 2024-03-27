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
 
void solve() {
    const int mV = 2e5+1, mL = 20;
    int a, b, u, v, r[mV][mL];
    cin >> a >> b;
    FOR(i, 2, a+1) cin >> r[i][0];
    FOR(i, 1, mL) FOR(j, 1, a+1) r[j][i] = r[r[j][i-1]][i-1];
    FR(i, b) {
        cin >> u >> v;
        FR(j, mL) if(v & (1 << j)) u = r[u][j];
        cout << (u ? u : -1) << '\n';
    }
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    solve();
}
