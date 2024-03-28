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

void solve2() {
    int n;
    cin >> n;
    vector<int> a(n), b(n);
    for(int &x : a) cin >> x;
    for(int &x : b) cin >> x;

    vector<tuple<char, int, int>> ops;

    for(int i = 0; i < n; ++i) {
        auto it = find(a.begin() + i, a.end(), b[i]);
        int end = distance(a.begin(), it);
        if(a[i] != b[i]) {
            if(i > 0 && b[i] == a[i-1] && b[i - 1] == a[i - 1]) {
                int j = i;
                while(j < n && b[j] == a[i-1]) j++;
                ops.push_back(make_tuple('R', i-1, j-1));
                for(int k = i; k < j; ++k) a[k] = a[i-1];
                i = j-1; 
            }
            else if(i < n-1 && it != a.end() && end > i && b[end] == a[end]) {
                bool trueSwipe = true;
                for(int j = i; j <= end; ++j) {
                    if (a[j] != b[end]) {
                        trueSwipe = false;
                        continue;
                    } 
                }
                if (trueSwipe == true) {
                    for(int j = i; j <= end; ++j) {
                        a[j] = b[i];
                    }
                }
                ops.push_back(make_tuple('L', i, end));
                i = end + 1;
                continue;
            }
            else {
                if (n == 1) {
                    cout << "YES\n1\nR 0 0";
                } else {
                    cout << "NO\n";
                }
                return;
            }
        }
    }

    cout << "YES\n" << ops.size() << "\n";
    for(auto &[dir, l, r]: ops) {
        cout << dir << " " << l << " " << r << "\n";
    }
}

void solve() {
    int n;
    cin >> n;
    vector<int> a(n), b(n);
    FR(i, n) cin >> a[i];
    FR(i, n) cin >> b[i];

    vector<pair<char, pair<int, int>>> operations;
    if (n != 1) {
        for(int i = 0; i < n;) {
            if(a[i] != b[i]) {
                auto it = find(a.begin() + i, a.end(), b[i]);
                if (it != a.end()) {
                    int end = distance(a.begin(), it);
                    if(end > i) {
                        for(int j = i; j <= end; ++j) a[j] = b[i];
                        operations.push_back({'L', {i, end}});
                        i = end + 1;
                        continue;
                    }
                }

                if (i > 0) {
                    if (a[i - 1] == b[i - 1]) {
                        int start = i;
                        int valueToMatch = b[i - 1];
                        while(i < n && a[i] != valueToMatch && a[i - 1] == b[i - 1] && a[i] != b[i]) {
                            a[i] = valueToMatch;
                            ++i;
                        }
                        operations.push_back({'R', {start - 1, i - 1}});
                    } 
                }
            } else {
                ++i;
            }
        }
    } else {
        cout << "YES" << "\n" << 1<< "\n" << "R 0 0";
        return;
    }

    if(a != b && n > 1) {
        cout << "NO\n";
        return;
    } else {
        cout << "YES\n" << operations.size() << "\n";
        for(const auto &op: operations) {
            cout << op.first << " " << op.second.first << " " << op.second.second << "\n";
        }
    }   
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    solve2();

    return 0;
}
