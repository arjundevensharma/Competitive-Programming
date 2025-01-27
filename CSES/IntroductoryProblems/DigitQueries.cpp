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
 
void solve() {
    ll y; scanf("%lld", &y); y--;
    ll b = 9, d = 1, l = 1;
    while(y >= b * d) {
        y -= b * d;
        b *= 10;
        l++;
        d++;
    }
    ll z = y / d;
    ll r = y % d;
    ll x = 1;
    FOR(i, 1, l) x *= 10;
    string s = to_string(x + z);
    printf("%c\n", s[r]);
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
 
    int t; scanf("%d", &t);
    while (t--)
        solve();
}
