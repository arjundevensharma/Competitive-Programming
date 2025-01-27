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
    const int mx = 4e5;
    int z, x, y, p, m;
    struct evt {int t, k;} es[mx];
 
    cin >> z;
    FR(i, z){
        cin >> x >> y;
        es[2*i] = {x, 1};
        es[2*i+1] = {y, -1};
    }
    sort(es, es+2*z, [](evt c, evt d){
        return c.t != d.t ? c.t < d.t : c.k < d.k;
    });
 
    p = m = 0;
    FR(i, 2*z){
        p += es[i].k;
        m = max(m, p);
    }
    cout << m << "\n";
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
 
    solve();
}
