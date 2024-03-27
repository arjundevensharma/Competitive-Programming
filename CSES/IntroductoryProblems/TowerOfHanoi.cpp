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
    cin >> n;
    cout << (1 << n) - 1 << "\n";
    function<void(int, int, int)> h = [&](int a, int b, int d) {
        if(d == 0) return;
        int c = 6 - a - b;
        h(a, c, d - 1);
        cout << a << " " << b << "\n";
        h(c, b, d - 1);
    };
    h(1, 3, n);
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    solve();
}
