#include <bits/stdc++.h>
using namespace std;
 
#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define sz(a) (int)a.size()
#define ar array
 
int n;
 
vector<int> max3inds (vector<int> a) {
    vector<int> d = {-1, -1, -1};
 
    for (int i = 0; i < n; i++) {
        if (a[i] > a[d[0]] || d[0] == -1) {
            d[2] = d[1];
            d[1] = d[0];
            d[0] = i;
        } else if (a[i] > a[d[1]] || d[1] == -1) {
            d[2] = d[1];
            d[1] = i;
        } else if (a[i] > a[d[2]] || d[2] == -1) {
            d[2] = i;
        }
    }
 
    return d;
}
 
void solve () {
    cin >> n;
 
    vector<int> a(n);
    vector<int> b(n);
    vector<int> c(n);
 
    vector<int> d(3);
    vector<int> e(3);
    vector<int> f(3);
 
    for (int i = 0; i < n; i++) cin >> a[i];
    for (int i = 0; i < n; i++) cin >> b[i];
    for (int i = 0; i < n; i++) cin >> c[i];
 
    int sum = 0;
 
    for (int i: max3inds(a)) {
        for (int j: max3inds(b)) {
            for (int k: max3inds(c)) {
                if ( (a[i] + b[j] + c[k]) > sum && i != j && j != k && i != k)
                    sum = a[i] + b[j] + c[k];
            }
        }   
    }
 
    cout << sum << "\n";
}
 
int main () {
    ios::sync_with_stdio();
    cin.tie(0);
 
    int t;
    cin >> t;
    
    while (t--)
        solve();
}
