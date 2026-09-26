class Solution {
public:
    string restoreString(string s, vector<int>& indices) {
        vector<pair<int,char>>mp;
        for(int i=0;i<s.size();i++){
            mp.push_back({indices[i],s[i]});
        }
        sort(mp.begin(),mp.end());

        string ans="";
        for(int i=0;i<mp.size();i++){
            ans.push_back(mp[i].second);
        }
        return ans;
    }
};