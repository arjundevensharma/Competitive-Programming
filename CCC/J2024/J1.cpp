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

int a;

void solve2() {
    cin >> a;

    while (true) {
        int b;
        cin >> b;

        if (a > b) {
            a+=b;
        } else {
            break;
        }
    }

    cout << a;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    solve2();

    return 0;
}
