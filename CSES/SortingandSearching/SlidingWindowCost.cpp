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
    const int mX = 2e5+1;
    int p, q, y[mX];
    ll sL = 0, sH = 0;
    multiset<int> gL, gH;
 
    auto cF = [&]()->ll {
        ll m = *prev(gL.end());
        return (m * sz(gL) - sL) + (sH - m * sz(gH));
    };
 
    auto gLtH = [&](){
        ll v = *prev(gL.end());
        gL.erase(prev(gL.end()));
        gH.insert(v);
        sL -= v;
        sH += v;
    };
 
    auto gHtL = [&](){
        ll v = *gH.begin();
        gL.insert(v);
        gH.erase(gH.begin());
        sL += v;
        sH -= v;
    };
 
    auto bL = [&](){
        while(sz(gL) > sz(gH) + 1) gLtH();
        while(sz(gH) > sz(gL)) gHtL();
    };
 
    auto eV = [&](ll v){
        if(v > *prev(gL.end())){
            gH.erase(gH.find(v));
            sH -= v;
        }else{
            gL.erase(gL.find(v));
            sL -= v;
        }
        bL();
    };
 
    auto aV = [&](ll v){
        if(!sz(gL) || v <= *prev(gL.end())) {
            gL.insert(v);
            sL += v;
        } else {
            gH.insert(v);
            sH += v;
        }
        bL();
    };
 
    scanf("%d %d", &p, &q);
    FR(i, q){
        scanf("%d", &y[i]);
        aV(y[i]);
    }
 
    printf("%lld%c", cF(), " \n"[q==p]);
    FOR(i, q, p){
        scanf("%d", &y[i]);
        aV(y[i]);
        eV(y[i-q]);
        printf("%lld%c", cF(), " \n"[i==p-1]);
    }
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
 
    solve();
}
