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
    int X, Y, z[26][505];
    char Q[1005];
    ll v, w[505][1005], P = 1000000007;
 
    auto p26 = [&](ll e) {
        ll r = 1, s = 26;
        while (e) {
            if (e & 1) r = (r * s) % P;
            s = (s * s) % P;
            e >>= 1;
        }
        return r;
    };
 
    auto f = [&](vector<char> u, int m) {
        int L = sz(u);
        FR(i, L - m) if (u[i + m] != Q[i]) return false;
        return true;
    };
 
    cin >> X >> Q;
    Y = strlen(Q);
    if (Y > X) {
        cout << "0\n";
        return;
    }
 
    FR(i, Y) FR(j, 26) {
        vector<char> u;
        FR(k, i) u.pb(Q[k]);
        u.pb('A' + j);
        FR(k, i + 1) if (f(u, k)) { z[j][i] = i - k + 1; break; }
    }
 
    w[0][0] = 1;
    FOR(i, 1, X + 1) FR(j, Y) FR(k, 26) w[z[k][j]][i] = (w[z[k][j]][i] + w[j][i - 1]) % P;
 
    v = p26(X);
    FR(i, Y) v = (v - w[i][X] + P) % P;
    cout << v << '\n';
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
 
    solve();
}
