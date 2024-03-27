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
    const int lim = 2e5+1;
    int X, Y, Z, p[lim], q[lim];
    cin >> X >> Y >> Z;
    FR(x, X) cin >> p[x];
    FR(y, Y) cin >> q[y];
 
    sort(p, p+X);
    sort(q, q+Y);
 
    int pairs = 0, px = 0, qx = 0;
    while(px < X && qx < Y){
        if(q[qx] >= p[px] - Z && q[qx] <= p[px] + Z){
            pairs++, px++, qx++;
        } else if(q[qx] < p[px] - Z) qx++;
        else px++;
    }
    cout << pairs << "\n";
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    solve();
}
