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
 
void solve() {
    int M, s[400002], e[400002], r[400002];
    struct Show {int z, x, y;} shows[400002];
    map<int, int> sched;
    
    scanf("%d", &M);
    FR(i, M) {
        scanf("%d %d", &s[i], &e[i]);
        shows[2*i] = {s[i], i, 0};
        shows[2*i+1] = {e[i], i, 1};
    }
    
    sort(shows, shows+2*M, [](Show c, Show d) {
        return c.z == d.z ? c.x < d.x : c.z < d.z;
    });
    
    FR(j, 2*M) sched[shows[j].z] = j;
    
    FR(k, 2*M) {
        if(shows[k].y == 0) r[k] = r[k-1];
        else r[k] = max(r[k-1], r[sched[s[shows[k].x]]] + 1);
    }
    
    printf("%d\n", r[2*M-1]);
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
 
    solve();
}
