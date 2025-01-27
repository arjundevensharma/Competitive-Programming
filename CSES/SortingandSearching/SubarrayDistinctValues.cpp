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
    int p, q, v[200005];
    map<int, int> m;
    ll total = 0;
 
    scanf("%d %d", &p, &q);
    FOR(i, 1, p + 1) scanf("%d", &v[i]);
 
    int diff = 0;
    int j = 0;
    FOR(i, 1, p + 1) {
        while(j < p && (m[v[j + 1]] > 0 || diff < q)) {
            j++;
            m[v[j]] += 1;
            if(m[v[j]] == 1) diff++;
        }
 
        total += j - i + 1;
        
        m[v[i]] -= 1;
        if(m[v[i]] == 0) diff--;
    }
 
    printf("%lld\n", total);
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
 
    solve();
}
