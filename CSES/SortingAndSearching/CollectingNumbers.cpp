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
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    const int mx = 2e5+1;
    int z, y, k = 1, l[mx];
    cin >> z;
    FR(i, z) {
        cin >> y;
        l[y] = i + 1;
    }
    FOR(i, 2, z + 1)
        if (l[i] < l[i - 1]) k++;
    cout << k << "\n";
}
 
int main() {
    solve();
}
