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
    const ll MOD = 1e9+7;
    const int LIM = 1e6+5, PR = 3;
    ll h1[PR], h2[PR], pm[PR][LIM];
    int x, y, r = 0;
    char a[LIM], b[LIM];
    const ll bpr[PR] = {43, 37, 31};
    scanf("%s %s", a, b);
    x = strlen(a); y = strlen(b);
    if(y > x) {
        printf("0\n");
        return;
    }
    FR(i, PR) {
        pm[i][0] = 1;
        FOR(j, 1, LIM)
            pm[i][j] = (pm[i][j-1] * bpr[i]) % MOD;
    }
    FR(j, y) FR(i, PR) {
        h1[i] = (h1[i] + (a[j] - 'a' + 1) * pm[i][y-j-1]) % MOD;
        h2[i] = (h2[i] + (b[j] - 'a' + 1) * pm[i][y-j-1]) % MOD;
    }
    auto eq = [&]() {
        FR(i, PR) if(h1[i] != h2[i]) return false;
        return true;
    };
    if(eq()) r++;
    FOR(j, y, x) {
        FR(i, PR) {
            h1[i] = (h1[i] * bpr[i] - (a[j-y] - 'a' + 1) * pm[i][y]) % MOD;
            if(h1[i] < 0) h1[i] += MOD;
            h1[i] = (h1[i] + (a[j] - 'a' + 1)) % MOD;
        }
        if(eq()) r++;
    }
    printf("%d\n", r);
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    solve();
}
