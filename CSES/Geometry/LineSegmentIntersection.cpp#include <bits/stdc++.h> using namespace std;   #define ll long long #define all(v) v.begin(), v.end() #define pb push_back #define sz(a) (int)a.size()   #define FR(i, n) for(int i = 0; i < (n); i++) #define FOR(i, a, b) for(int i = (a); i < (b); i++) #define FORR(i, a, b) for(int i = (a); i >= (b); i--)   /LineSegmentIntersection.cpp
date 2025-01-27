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
 
struct Vec {
    int a, b;
    void fill() { cin >> a >> b; }
    Vec operator +(const Vec& d) const { return Vec{a + d.a, b + d.b}; }
    Vec operator -(const Vec& d) const { return Vec{a - d.a, b - d.b}; }
    ll dot(const Vec& d) const { return (ll)a * d.b - (ll)b * d.a; }
    void shift(const Vec& d) { a += d.a; b += d.b; }
    void shrink(const Vec &d) { a -= d.a; b -= d.b; }
    void scale(const int m) { a *= m; b *= m; }
    ll prod(const Vec& d, const Vec& e) const { return (d - *this).dot(e - *this); }
};
 
int q;
Vec R[4];
 
void solve() {
    FR(i, 4) R[i].fill();
    Vec A = R[0], B = R[1], C = R[2], D = R[3];
 
    if((B - A).dot(D - C) == 0) {
        if(A.prod(B, C) == 0) {
            FR(j, 2) {
                if(max(A.a, B.a) < min(C.a, D.a) || max(A.b, B.b) < min(C.b, D.b)) {
                    cout << "NO\n";
                    return;
                }
                swap(A, C); swap(B, D);
            }
            cout << "YES\n";
            return;
        }
        cout << "NO\n";
        return;
    }
 
    FR(k, 2) {
        ll d1 = A.prod(B, C), d2 = A.prod(B, D);
        if((d1 < 0 && d2 < 0) || (d1 > 0 && d2 > 0)) {
            cout << "NO\n";
            return;
        }
        swap(A, C); swap(B, D);
    }
 
    cout << "YES\n";
}
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
 
    cin >> q;
    while (q--)
        solve();
}
