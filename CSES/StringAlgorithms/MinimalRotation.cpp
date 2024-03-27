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
    const int MX = 2e6+5;
    int L, P[MX];
    char T[MX*2];
 
    cin >> T;
    L = strlen(T);
    FR(j, L) T[j+L] = T[j];
    L *= 2;
    memset(P, -1, sizeof(P));
 
    int x = 0;
    FOR(j, 1, L){
        char ch = T[j];
        int px = P[j-x-1];
        while(px != -1 && ch != T[x+px+1]){
            if(ch < T[x+px+1]) x = j-px-1;
            px = P[px];
        }
 
        if(ch == T[x+px+1]) P[j-x] = px+1;
        else{
            if(ch < T[x]) x = j;
            P[j-x] = -1;
        }
    }
 
    FR(j, L/2) cout << T[j+x];
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    solve();
}
