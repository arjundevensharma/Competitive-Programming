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
    const int MX = 2e5+10;
    struct Vertex {
        ll count;
        int depth, suffLink;
        map<char,int> next;
    } vt[MX];
 
    char str[MX/2];
    int L, size = 1, tail = 0;
 
    auto init = [&]() {
        vt[0].depth = 0;
        vt[0].suffLink = -1;
        size = 1;
        tail = 0;
    };
 
    auto add = [&](char ch) {
        int current = size++;
        vt[current].depth = vt[tail].depth + 1;
        int link;
        for(link = tail; link != -1 && !vt[link].next.count(ch); link = vt[link].suffLink) {
            vt[link].next[ch] = current;
        }
        if(link == -1) {
            vt[current].suffLink = 0;
        } else {
            int q = vt[link].next[ch];
            if(vt[link].depth + 1 == vt[q].depth) {
                vt[current].suffLink = q;
            } else {
                int clone = size++;
                vt[clone] = vt[q];
                vt[clone].depth = vt[link].depth + 1;
                while(link != -1 && vt[link].next[ch] == q) {
                    vt[link].next[ch] = clone;
                    link = vt[link].suffLink;
                }
                vt[q].suffLink = vt[current].suffLink = clone;
            }
        }
        tail = current;
    };
 
    function<void(int)> dfs = [&](int v) {
        vt[v].count = 1;
        for(auto it : vt[v].next) {
            if(!vt[it.second].count) dfs(it.second);
            vt[v].count += vt[it.second].count;
        }
    };
 
    cin >> str;
    L = strlen(str);
 
    init();
    FR(i, L) add(str[i]);
    dfs(0);
 
    cout << vt[0].count - 1 << "\n";
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    solve();
}
