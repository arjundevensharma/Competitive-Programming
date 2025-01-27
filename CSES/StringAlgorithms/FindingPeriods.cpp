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
    const ll MOD = 1e9 + 7;
    const int MX = 1e6 + 5;
    const ll B1 = 31, B2 = 37;
 
    char str[MX];
    cin >> str;
    n = strlen(str);
 
    ll b1[MX], b2[MX], f1[MX], f2[MX], r1 = 0, r2 = 0;
    b1[0] = b2[0] = 1;
    f1[0] = f2[0] = str[0] - 'a' + 1;
 
    FOR(i, 1, MX) {
        b1[i] = (b1[i-1] * B1) % MOD;
        b2[i] = (b2[i-1] * B2) % MOD;
        f1[i] = (f1[i-1] * B1 + (str[i] - 'a' + 1)) % MOD;
        f2[i] = (f2[i-1] * B2 + (str[i] - 'a' + 1)) % MOD;
    }
 
    FOR(L, 1, n + 1) {
        r1 = f1[L-1];
        r2 = f2[L-1];
        FR(k, n / L - 1) {
            r1 = (r1 * b1[L] + f1[L-1]) % MOD;
            r2 = (r2 * b2[L] + f2[L-1]) % MOD;
        }
        r1 = (r1 * b1[n % L] + f1[n % L - 1]) % MOD;
        r2 = (r2 * b2[n % L] + f2[n % L - 1]) % MOD;
        if(r1 == f1[n-1] && r2 == f2[n-1]) cout << L << " ";
    }
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    solve();
}
