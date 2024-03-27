#include <bits/stdc++.h>
using namespace std;
 
#define ll long long
#define all(v) v.begin(), v.end()
#define pb push_back
#define sz(a) (int)a.size()
#define ar array
 
int n, p;
 
void solve () {
    cin >> n >> p;

    vector<pair<int, int>> ab (n + 1);
    for (int i = 0; i < n; i++) cin >> ab[i].second;
    for (int i = 0; i < n; i++) cin >> ab[i].first;

    ll totCost = p;
    int residentsLeft = n - 1;

    ab.push_back(make_pair(p, n));

    sort(all(ab));

    int ind = 0;

    while (residentsLeft > 0) {
        for (int i = 0; i < ab[ind].second && residentsLeft > 0; i++) {
            residentsLeft --;
            totCost += ab[ind].first;
        }
        ind++;
    }

    cout << totCost << "\n";
}
 
int main () {
    ios::sync_with_stdio();
    cin.tie(0);
 
    int t;
    cin >> t;
    
    while (t--)
        solve();
}
