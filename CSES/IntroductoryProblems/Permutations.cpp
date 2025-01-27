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
 
void solve () {
    cin >> n;
 
    if (n > 1 && n < 4) cout << "NO SOLUTION";
    else if (n == 1) cout << 1;
    else if (n == 4) cout << "2 4 1 3";
    else {
        int a = n;
        while (a > 0) {
            cout << a << " ";
            a -= 2;
        }
        a = n - 1;
        while (a > 0) {
            cout << a << " ";
            a -= 2;
        }
    }
}
 
int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);
 
    solve();
}
