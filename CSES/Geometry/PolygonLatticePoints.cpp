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
    int M;
    cin >> M;
    vector<ll> vX(M+1), vY(M+1);
    ll pArea = 0, pBoundary = 0, pInside;
    
    FR(i, M) cin >> vX[i] >> vY[i];
    vX[M] = vX[0], vY[M] = vY[0];
 
    FR(i, M) {
        pArea += vX[i] * vY[i+1] - vY[i] * vX[i+1];
    }
    pArea = abs(pArea);
 
    FR(i, M) {
        ll dx = abs(vX[i+1] - vX[i]), dy = abs(vY[i+1] - vY[i]);
        if(dx == 0) pBoundary += dy;
        else if(dy == 0) pBoundary += dx;
        else pBoundary += __gcd(dx, dy);
    }
 
    cout << (pArea + 2 - pBoundary) / 2 << " " << pBoundary << "\n";
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
 
    solve();
}
