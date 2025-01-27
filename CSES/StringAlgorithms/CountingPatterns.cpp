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
    const int lim = 2e5+10;
    struct Vertex {
        int depth, suffix, count;
        map<char,int> next;
    } vtx[2*lim];
 
    char inp[lim], qry[5*lim];
    int inpLen, qryLen, queries, vtxCount = 1, active = 0;
 
    auto add = [&](char ch) {
        int cur = vtxCount++, p = active;
        vtx[cur].count = 1;
        vtx[cur].depth = vtx[active].depth + 1;
        for (; p >= 0 && !vtx[p].next.count(ch); p = vtx[p].suffix) {
            vtx[p].next[ch] = cur;
        }
        if (p < 0) {
            vtx[cur].suffix = 0;
        } else {
            int q = vtx[p].next[ch];
            if (vtx[q].depth == vtx[p].depth + 1) {
                vtx[cur].suffix = q;
            } else {
                int clone = vtxCount++;
                vtx[clone] = {vtx[p].depth + 1, vtx[q].suffix, 0, vtx[q].next};
                for (; p >= 0 && vtx[p].next[ch] == q; p = vtx[p].suffix) {
                    vtx[p].next[ch] = clone;
                }
                vtx[q].suffix = vtx[cur].suffix = clone;
            }
        }
        active = cur;
    };
 
    auto init = [&]() {
        vtx[0].depth = 0;
        vtx[0].suffix = -1;
        active = 0;
    };
 
    auto updateCounts = [&]() {
        vector<int> level[vtxCount];
        FR(i, vtxCount) level[vtx[i].depth].pb(i);
        FORR(i, vtxCount-1, 0) {
            for (int u : level[i])
                if (vtx[u].suffix >= 0)
                    vtx[vtx[u].suffix].count += vtx[u].count;
        }
    };
 
    auto compute = [&]() -> int {
        int v = 0;
        FR(i, qryLen) {
            char c = qry[i];
            if (!vtx[v].next.count(c)) return 0;
            v = vtx[v].next[c];
        }
        return vtx[v].count;
    };
 
    scanf(" %s %d", inp, &queries);
    inpLen = strlen(inp);
    init();
    FR(i, inpLen) add(inp[i]);
    updateCounts();
 
    FR(i, queries) {
        scanf(" %s", qry);
        qryLen = strlen(qry);
        printf("%d\n", compute());
    }
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    solve();
}
